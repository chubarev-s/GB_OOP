package calculator;
import java.text.NumberFormat;
import java.util.StringTokenizer;


public class Complex implements Complable{

    private double realNum = 0; 
    private double imagNum = 0;
    private double primaryArg;

    public Complex(String value) throws java.text.ParseException {
        String val = removeSpaces(value);
        parseComplex(val);
    }
    
    public Complex(Complex value) {
        realNum = value.getRealNum();
        imagNum = value.getImagNum();
    }

    public double getRealNum() {
        return realNum;
    }

    public double getImagNum() {
        return imagNum;
    }

    @Override
    //преобразуем комплексное число в строку
    public String toString() {
        String retValue;
        NumberFormat nf = NumberFormat.getInstance();
        if(realNum == 0)
            retValue = nf.format(imagNum) + "i";
        else
            if(imagNum > 0)
                retValue = nf.format(realNum) + "+" + nf.format(imagNum) + "i";
            else
                retValue = nf.format(realNum) + nf.format(imagNum) + "i";
        if(imagNum == 0)
            retValue = nf.format(realNum);
        return retValue;
    }
    //удаляем пробелы из строки
    private String removeSpaces(String str) {
        StringTokenizer st = new StringTokenizer(str);
        StringBuffer temp = new StringBuffer(str.length());
        while(st.hasMoreTokens())
        {
            temp.append(st.nextToken());
        }
        return temp.toString();
    }

    //преобразуем строку в комплексное число(строка без пробелов)
    private void parseComplex(String str) throws java.text.ParseException {
        StringTokenizer st = new StringTokenizer(str, "+-", true);
        String previousToken = "";
        String currentToken = "";
        String numb = "";
        NumberFormat nf = NumberFormat.getInstance();
        while(st.hasMoreTokens())
        {
            currentToken = st.nextToken();
            if(previousToken.equals("-"))
                numb = previousToken + currentToken;
            else
                numb = currentToken;
            if(numb.equals("+") == false && numb.equals("-") == false)
            {
                if(numb.indexOf('i') == -1)
                    realNum = nf.parse(numb).doubleValue();
                else
                {
                    numb = numb.replace('i', ' ');
                    if(numb.equals(" "))
                        numb = "1";
                    if(numb.equals("- "))
                        numb = "-1";
                    imagNum = nf.parse(numb).doubleValue();
                }
            }
            previousToken = currentToken;
        }
    }
    //проверка комлексного числа, равно ли заданному
    public boolean equal(Complex value) {
        if(realNum == value.realNum && imagNum == value.imagNum)
            return true;
        return false;
    }
    
    //Прибавляем к компл.числу заданное
    public Complex add(Complex value) {
        realNum += value.realNum;
        imagNum += value.imagNum;
        return this;
    }
    //вычитание
     public Complex sub(Complex value) {
        realNum -= value.realNum;
        imagNum -= value.imagNum;
        return this;
    }
    //умножение
    public Complex mult(Complex value) {
        double tempRealNum = realNum * value.realNum - imagNum * value.imagNum;
        double tempImagNum = realNum * value.imagNum + imagNum * value.imagNum;
        realNum = tempRealNum;
        imagNum = tempImagNum;
        return this;
    }
    //деление
    public Complex div(Complex value) {
        double denominator = value.realNum * value.realNum + value.imagNum * value.imagNum;
        if(denominator == 0)
        {
            realNum = imagNum = 0;
            return this;
        }
        double tempRealNum, tempImagNum;
        tempRealNum = (realNum * value.realNum + imagNum * value.imagNum) / denominator;
        tempImagNum = (imagNum * value.realNum - realNum * value.imagNum) / denominator;
        realNum = tempRealNum;
        imagNum = tempImagNum;
         return this;
    }

      @Override
    public double getResult() {
        return primaryArg;
    }
}