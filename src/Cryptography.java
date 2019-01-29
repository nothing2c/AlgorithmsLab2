import javax.swing.*;

public class Cryptography {
    public static void main(String[] args) {
        String text = "This is a secret message";
        text = encrypt(text, 5);
        System.out.println(text);
        text = decrypt(text);
        System.out.println(text);
    }

    private static String encrypt(String plainText, int numColumns)
    {
        char character;
        String newString="";
        String cipherText="";
        int numRows=1;

        for(int i=0; i < plainText.length(); i++)
        {
            character = plainText.charAt(i);
            if(character != ' ')
            {
                newString+=character;
            }
        }

        numRows=newString.length()/numColumns;

        if(newString.length()%numColumns!=0)
        {
            numRows++;
            for(int i=newString.length(); i < numColumns*numRows;i++)
            {
                newString+="x";
            }
        }

        System.out.println(newString);
        System.out.println(newString.length());

        for(int i = 0; i < numColumns; i++)
        {
            int index = i;
            for(int x = 0;x < numRows;x++)
            {
                cipherText+=newString.charAt(index);
                index+=numColumns;

            }
            cipherText+=" ";
        }

        return cipherText;
    }

    private static String decrypt(String cipherText)
    {
        int numColumns;
        char character;
        String newString="";

        for(int i=0; i < cipherText.length(); i++)
        {
            character = cipherText.charAt(i);
            if(character != ' ')
            {
                newString+=character;
            }
        }

        

        return newString;
    }
}
