package com.softycon.conditional_statements;

class WithLabelledLoop
{
    public static void main(String args[])
    {
        int i,j,k;
        loop1:   for(i=1;i<=10;i++)
        {

            System.out.println("Iteration : " + i);
            loop2:   for(j=1;j<=10;j++)
            {
                System.out.println("Inner Iteration : " + j);
                for(k=1;k<=10;k++)
                {
                    System.out.print(k + " ");
                   if(i == 5 && k==5) {
                       System.out.println();
                       break loop2;     //Statement 1
                   }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

