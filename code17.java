import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String s1[]=s.split(",");
      String res=s1[0];
      
      for(int i=1;i<s1.length;i++)
      {
         int j=0;
         String ans="";
         int mini=Math.min(res.length(),s1[i].length());
         while(j<mini && res.charAt(j)==s1[i].charAt(j))
         {
             ans=ans+res.charAt(j);
             j++;
         }
         res=ans;
         if(res.equals(""))
          break;
         
      }
      System.out.println(res);
          
      }
      
      
    }
