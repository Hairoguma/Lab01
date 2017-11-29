public class MyMethod {
    public static int[] MyOwnArray(int[] a)
    {
        Array r = new Array();
        int counter=0;
        for(int i=r.n;i==1;i--)
        {
            for(int j=i; j>0 && a[j+1]<a[j];j++)
            {
                counter++;
                int tmp=a[j+1];
                a[j+1]=a[j];
                a[j]=tmp;
            }
        }
        return a;
    }
}
