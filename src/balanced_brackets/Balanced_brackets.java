/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanced_brackets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

        

/**
 *
 * @author DELL
 */
public class Balanced_brackets {

    /**
     * @param args the command line arguments
     * @return 
    
     * @throws java.io.IOException
     */
    public static int main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
       Stack <Character> st=new Stack<>();
       char c,c1;
       int k=0;
       for(int i=0;i<t;i++)
       {
       String s=br.readLine();
       int l=s.length();
       
       for(int j=0;j<l-1;j++)
       {
        c=s.charAt(j);
      if(c=='('||c=='{'||c=='[')
      {
          
       st.push(c);
      }
        c1=s.charAt(j+1);
       if((st.peek()=='('&& c1==')')||(st.peek()=='['&& c1==']')||(st.peek()=='{'&& c1=='}'))
       {
       st.pop();
       
       }
       else return 0;
       
       
       
       
       }
       if(st.isEmpty())
           System.out.println("YES");
       else 
            System.out.println("NO" );
       while(!st.isEmpty())
       {
       st.pop();
       }
      
       }
       
        
        // TODO code application logic here
        return 0;
     
    }
    
}
