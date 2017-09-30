import java.util.*;

public class JavaApplication5 {

    
    public static void main(String[] args) {
    Scanner inn= new Scanner(System.in);
    int m=1,l=0;
    int d=inn.nextInt();
    int sum=0,j=0;
    String str="";
    String[] k=new String[d];
    for(j=0;j<d;j++)
    {k[j]=inn.next();
    }
   for(int i=0;m==1;i++)
        {sum=0;
            for(j=0;j<d-1;j++)
            {if(k[j].charAt(i)==k[j+1].charAt(i))
                {sum+=1;l=j;
                }
            }
            if(sum==d-1)
            {str = str+k[l].charAt(i);
            }
            else
            {m=0;}
        }
        System.out.println(str);
    }
    
}
