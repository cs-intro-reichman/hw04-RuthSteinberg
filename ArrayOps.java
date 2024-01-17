public class ArrayOps {
    public static void main(String[] args) {
       // int [] array = Array.parseInt(args[0]);
        System.out.println(findMissingInt(new int[] {3,2,1}));
        System.out.println(secondMaxValue(new int[] {1, -2, 3, -4, 5}));
        System.out.println(containsTheSameElements(new int[] {1,2,3,-4,5}, new int[] {1,3,-4,5}));
        System.out.println(isSorted(new int[] {4,3,2,1}));
        
    }
    
    public static int findMissingInt (int [] array) {
        //int [] newarr=new int[array.length];
        int temp;
        int missNum=1;
        for(int i=0; i<array.length-1; i++) 
        {
           if((array[i]>array[i+1])&&(i!=array.length))
           {
            temp=array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
           }
           if((i==array.length-1)&&(array[i]>array[0]))
           {
             temp=array[i];
            array[i]=array[0];
            array[0]=temp;
            
           }
        }
        for(int j=0; j<array.length-1; j++) 
        {
            if(array[0]!=0)
            {
                missNum=0;
                break;
            }
            if((array[j+1]-array[j])>1)
            {
                missNum=j+1;
            }
        }
        return missNum;
    }

    public static int secondMaxValue(int [] array) {
        int max1=array[0];
        int max2=array[0];
        int indexmax=0;
        for(int i=0; i<array.length; i++) // find the first max
        {
           if(max1<array[i])
           {
           max1=array[i];
        indexmax=i;
           }
        }
        for(int j=0; j<array.length; j++) // find the second max
        {
           if((max2<array[j])&&(array[j]<=max1)&&(j!=indexmax))
           {
           max2=array[j];
          
           }
        }
        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean answer1=false;
        boolean answer2=false;
        for(int i=0; i<array1.length; i++)
        {
            for(int j=0; j<array2.length; j++)
            {
                if(array1[i]==array2[j])
                {
                  answer1=true;
                  break;  
                }
                else
                {answer1=false;}
            }
            if(answer1==false) {break;}
        }
        for(int k=0; k<array2.length; k++)
        {
            for(int w=0; w<array1.length; w++)
            {
                if(array2[k]==array1[w])
                {
                  answer2=true;
                  break;  
                }
                else
                {answer2=false;}
            }
        }
        if((answer1==true)&&(answer2==true))
        {
            return true;
        }
        else return false;

    }

   // else{
     //   for(int i=0; i<array2.length; i++)
       // {
         //   for(int j=0; j<array1.length; j++)
           // {
             //   if(array2[i]==array1[j])
               // {
                 // answer=true; 
                  //break; 
                //}
                //else{answer=false;}
            //}
        //}
    //}
    


    public static boolean isSorted(int [] array) {
        boolean isSort=false;
        //sort from small to big
        if(array[0]<array[1])
        {
        for(int i=0; i<array.length-1; i++)
        {
            if(array[i]<array[i+1])
            {
                isSort=true;
            }
            else
            return false;
        }
    }
    else{
        //sort from big to small
        for(int j=0; j<array.length-1; j++)
        {
         if(array[j]>array[j+1])
            {
                isSort=true;
            }  
            else
            return false;
        }
    }
    return isSort;
}
}


