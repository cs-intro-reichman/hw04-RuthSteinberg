public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest("one two three world"));
        System.out.println(camelCase(" Intro to coMPUter sCIEncE" ));
        System.out.println(allIndexOf("hello world", 'l'));
    }
    
    public static String capVowelsLowRest (String string) {
        String newStr="";
        for(int i=0; i<string.length(); i++)
        {
            char ch = string.charAt(i);
            if((ch==97)||(ch==101)||(ch==105)||(ch==111)||((ch==117))) //upper (a,e,i,o,u)
            {
                newStr=newStr+(char)(string.charAt(i)-32);
            }
            else
            {
                if(((ch>=64)&&(ch<=91))&&(ch!=79))
            {
                newStr=newStr+(char)(string.charAt(i)+32);
            }
            else
            {
                newStr=newStr+(char)(string.charAt(i));
            }
            }
        }
        return newStr;
    }

    public static String camelCase (String string) {
        String str = "";
        char chf=(char)(string.charAt(0));
        if(chf==32) //first char at the new string
        {
            if((string.charAt(1)>=65)&&(string.charAt(1)<=90))
            {
            char ch=(char)(string.charAt(1)+32);
            str=str+ch;
            }
            else{
                char ch=(char)(string.charAt(1));
            str=str+ch;
            }
        }
        else
        {
            if((string.charAt(0)>=65)&&(string.charAt(0)<=90))
            {
            char ch=(char)(string.charAt(0)+32);
            str=str+ch;
            }
            else{
                char ch=(char)(string.charAt(0));
            str=str+ch;
            }
        }
        for(int i=1; i<string.length(); i++)
        {
            //char ch=string.charAt(i);
            if ((string.charAt(i)==32)&&(string.charAt(i+1)!=32)&&(i!=1)) // if there is space and than char
            {
                if((string.charAt(i+1)>=97)&&(string.charAt(i+1)<=122)) 
                {
                char chst = (char)(string.charAt(i+1)-32);
                str=str+chst;
                }
                else 
                {
                char chst = string.charAt(i+1);
                str=str+chst;  
                }
                i=i+2;
            }
            if((string.charAt(i)>=65)&&(string.charAt(i)<=90)&&(i!=0))
            {
                //char chst = str.charAt(i);
                char chst=(char)(string.charAt(i)+32);
                str=str+chst;
            }
            if((string.charAt(i)>=97)&&(string.charAt(i)<=122)){
                char chst = string.charAt(i);
                str=str+chst;  
            }
    }
    if(string.charAt(0)==32)
    {
        str=str.substring(1,str.length());
    }
 return str;
}
    public static int[] allIndexOf (String string, char chr) {
        int num;
        int length=string.length();
        int [] array = new int[length];
        int temp=0;
        int i=0;
        int num1=(int)(string.indexOf(chr));
        while (string.indexOf(chr)>=0) {
            num = (int)(string.indexOf(chr)); //'hello' num=2 num=0
            if(i!=0)
            {
            array[i]=num+num1+1; // array[0]=2 array[1]=0
            num1=num+num1+1;
            }
            else
            { 
                array[i]=num;
                num1=num;
            }
            temp=temp+1;
            string=string.substring(string.indexOf(chr)+1); // string=lo string=o
            i=i+1;
        }
        int [] farray = new int [temp];
        for(int j=0; j<temp; j++)
        {
            farray[j]=array[j];
        }
        return farray;
    }
}

