
import java.util.*;
public class JavaApplication6 {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int k=in.nextInt();
        int t=k, c=0,d=0,sum=0, s=0,ten=1,ll=1;
        System.out.println("enter the k value");
        int kkk=in.nextInt();
                while(t!=0)
                {t=t/10;c++;
                }
                int kk[]=new int[c];c=0;t=k;
                while(t!=0)
                {kk[c++]=t%10;
                 t=t/10;
                }int max=0, l=0;
                while(d<kkk)
                {for(int j=c-1;j>=0;j--)
                    {if(max<kk[j])
                        {max=kk[j];
                        l=j;
                        }
                    }
               d++;kk[l]=-1;max=-1;
                }
               /* for(int j=c-1;j>=0;j--)
                {System.out.print(kk[j]+"  ");}*/
                
                for(int j=0;j<c;j++)
                {if(kk[j]!=-1)
                    {if(ll==1)
                    {ten=1;ll++;}
                    else
                    {ten=ten*10;}
                    sum=ten*kk[j];
                    s+=sum;
                    
                    }
                }System.out.println(s);
         
    }
    
}
