public class Insertion {
    public static int[] InsertedArray(int[] a)
    {
        Array r = new Array();
        int counter=0;
        for(int i=1;i<r.n;i++)
        {
            for(int j=i; j>0 && a[j-1]>a[j];j--)
            {
                counter++;
                int tmp=a[j-1];
                a[j-1]=a[j];
                a[j]=tmp;
            }
        }
        return a;
    }
}