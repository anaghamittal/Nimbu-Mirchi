import java.io.*;
class Total
{
    public static void main(String args[])throws IOException
    {
        StockV obj1=new StockV();
        StockF obj2=new StockF();
        StockFile obj=new StockFile();
        for(int i=0;i<20;i++)
        {
            obj.total=obj.total+obj1.veg[i]*obj.pricev[i];
        }
        for(int i=0;i<20;i++)
        {
            obj.total=obj.total+obj2.fru[i]*obj.pricef[i];
        }
        System.out.println(obj.total);
    }
}