package javapart3;

public class fyg {
    public static void main(String args[]){

        int a[]={10,15,1,2,3,4,5,11,12};

        int b=1;
        int c=0;
        for(int i=0;i<a.length-1;i++){

            if(a[i]-a[i+1]==-1){

                b=b+1;
                c=c+1;
                if(b>=c)
                {

                    System.out.println(a[i]);

                }
                else{
                    b=0;
                }

            }

        }
    }
}
