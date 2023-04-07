import javax.print.DocFlavor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        File file=new File("input.txt");
//        System.out.println(file.createNewFile());
        FileInputStream fileInputStream = new FileInputStream("input.txt");
        while (fileInputStream.available()!=0){
            System.out.println(lexer(fileInputStream));
        }


    }

    static char lastChar = '\0';
    static int rowNo = 0, colNo = 0;

    public static Token lexer(FileInputStream fileInputStream) throws IOException {
        Type type=null;
        char nextChar;
        char[] nextWord = new char[80];
        int state, length;
        state = 0;
        length = 0;
        while (fileInputStream.available() != 0) {
            if (lastChar != '\0') {
                nextChar = lastChar;
                lastChar = '\0';
            } else {
                nextChar = (char) fileInputStream.read();
            }
            nextWord[length++] = nextChar;
            if (nextChar == '\n') {
                colNo = 0;
                rowNo++;
            } else {
                colNo++;
            }
            switch (state) {
                case 0:
                    if (nextChar == '\n' || nextChar == '\t' || nextChar == ' ')
                        length = 0;
                    else if (nextChar == 'i') state = 1;
                    else if (nextChar == 's') state = 5;
                    else if (nextChar == 'c') state = 11;
                    else if (nextChar == 'w') state = 15;
                    else if (nextChar == 'f') state = 20;
                    else if (isDigit(nextChar)) state = 27;
                    else if (isAlpha(nextChar))
                        state = 29;
                    break;
                case 1:
                    if (nextChar == 'f') state = 4;
                    else if (nextChar == 'n') state = 2;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 2:
                    if (nextChar=='t') state=3;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 3:
                    type=Type.INT;
                    if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,type,nextWord);
                    else throw new RuntimeException(state+"moshkel");
                    break;
                case 4:
                    type=Type.IF;
                    if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,type,nextWord);
                    else throw new RuntimeException(state+"moshkel");
                    break;
                case 5:
                    if (nextChar=='w') state=6;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 6:
                    if (nextChar=='i') state=7;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 7:
                    if (nextChar=='t') state=8;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 8:
                    if (nextChar=='c') state=9;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 9:
                    if (nextChar=='h') state=10;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 10:
                    type=Type.SWITCH;
                    if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,type,nextWord);
                    else throw new RuntimeException(state+"moshkel");
                    break;
                case 11:
                    if (nextChar=='a') state=12;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 12:
                    if (nextChar=='s') state=13;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 13:
                    if (nextChar=='e') state=14;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 14:
                    type= Type.CASE;
                    if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,type,nextWord);
                    else throw new RuntimeException(state+"moshkel");
                    break;
                case 15:
                    if (nextChar=='h') state=16;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 16:
                    if (nextChar=='i') state=17;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 17:
                    if (nextChar=='l') state=18;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 18:
                    if (nextChar=='e') state=19;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 19:
                    type=Type.WHILE;
                    if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,type,nextWord);
                    else throw new RuntimeException(state+"moshkel");
                    break;
                case 20:
                    if (nextChar=='l') state=21;
                    else if (nextChar=='o') state=25;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 21:
                    if (nextChar=='o') state=22;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 22:
                    if (nextChar=='a') state=23;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 23:
                    if (nextChar=='t') state=24;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 24:
                    type=Type.FLOAT;
                    if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,type,nextWord);
                    else throw new RuntimeException(state+"moshkel");
                    break;
                case 25:
                    if (nextChar=='r') state=26;
                    else if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,Type.ID,nextWord);
                    else throw new RuntimeException(state+"mooshkel");
                    break;
                case 26:
                    type= Type.FOR;
                    if (isAlpha(nextChar) || isDigit(nextChar)) state = 29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,type,nextWord);
                    else throw new RuntimeException(state+"moshkel");
                    break;
                case 27:
                    type=Type.INT_NUMBER;
                    if (isDigit(nextChar)) state=27;
                    else if (nextChar=='.') state=28;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,type,nextWord);
                    else throw new RuntimeException(state+"moshkeeel");
                    break;
                case 28:
                    type=Type.FLOAT_NUMBER;
                    if (isDigit(nextChar)) state=28;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,type,nextWord);
                    else throw new RuntimeException(state+"moshkeeel");
                    break;
                case 29:
                    type=Type.ID;
                    if (isDigit(nextChar)||isAlpha(nextChar)) state=29;
                    else if (isSeparator(nextChar)) return new Token(rowNo,colNo-length,0,type,nextWord);
                    else throw new RuntimeException(state+"moshkeeel");
                    break;
            }
        }
        return new Token(rowNo,colNo-length,0,type,nextWord);
    }

    public static boolean isSeparator(char nextChar) {
        return nextChar == '\n' || nextChar == '\t' || nextChar == ' ' || nextChar == ';' || nextChar=='\0';
    }

    public static boolean isAlpha(char nextChar) {
        return (nextChar >= 'a' && nextChar <= 'z') || (nextChar >= 'A' && nextChar <= 'Z') || nextChar == '_';
    }

    public static boolean isDigit(char nextChar) {
        return nextChar >= '0' && nextChar <= '9';
    }


    static class Token {
        int row;
        int col;
        int blkNo;
        Type type;
        char[] name = new char[30];
        String string="";

        public Token(int row, int col, int blkNo, Type type, char[] name) {
            this.row = row;
            this.col = col;
            this.blkNo = blkNo;
            this.type = type;
            this.name = name;
            for (int i = 0; i < this.name.length; i++) {
                string+=this.name[i];
                if (this.name[i]=='\0'){
                    this.name[i-1]='\0';
                    string=string.substring(0,i);
                    break;
                }
            }
            string=string.substring(0,string.length()-1);
        }

        @Override
        public String toString() {
            return "Token{" +
                    "row=" + row +
                    ", col=" + col +
                    ", blkNo=" + blkNo +
                    ", type=" + type +
                    ", name=" + string +
                    '}';
        }
    }

    enum Type {
        SWITCH, CASE, INT, FLOAT, IF, WHILE, FOR, FLOAT_NUMBER, INT_NUMBER,ID
    }
}
