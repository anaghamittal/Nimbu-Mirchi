import java.io.*;
class TotalF extends StockFile
{
    public static void main(String args[])throws IOException
    {
        StockF obj2=new StockF();
        StockFile obj=new StockFile();
        for(int i=0;i<20;i++)
        {
            obj.total=obj.total+obj2.fru[i]*obj.pricef[i];
        }
    }
}