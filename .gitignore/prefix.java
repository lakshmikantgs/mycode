package guvi;
import java.util.*;
public class prefix 
{
    public static void main(String[] args) 
   {int k, fl=0,j=0,l=0;
   Scanner in=new Scanner(System.in);
   k=in.nextInt();
   int arr[]=new int[k];
   for(int i=0;i<k;i++)
   {arr[i]=in.nextInt();}
   for(int i=0;i<k;i++)
        {fl=0;if(arr[i]!=-1)
        {
            for(j=i+1;j<k;j++)
            {if(arr[i]==arr[j])
                {fl=1;l=j;arr[j]= -1;
                }
            }
        }
        if(fl==1)
            {System.out.println(arr[i]);
            }
        }         
    }
    
}
