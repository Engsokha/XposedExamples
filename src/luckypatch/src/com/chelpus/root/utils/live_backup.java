package com.chelpus.root.utils;

import com.chelpus.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class live_backup
{
  private static String dalvikDexIn = "/data/dalvik-cache/data@app@zamenitetodelo-1.apk@classes.dex";
  
  public static void main(String[] paramArrayOfString)
  {
    Utils.startRootJava(new Object() {});
    String str = dalvikDexIn.replace("zamenitetodelo", paramArrayOfString[0]);
    try
    {
      localObject = new File(str);
      paramArrayOfString = (String[])localObject;
      if (!((File)localObject).exists()) {
        paramArrayOfString = new File(str.replace("-1", "-2"));
      }
      localObject = new File(str.replace("-1", ""));
      if (paramArrayOfString.exists()) {
        localObject = paramArrayOfString;
      }
      str = str.replace("data@app", "mnt@asec").replace(".apk@classes.dex", "@pkg.apk@classes.dex");
      paramArrayOfString = new File(str);
      if (paramArrayOfString.exists()) {
        localObject = paramArrayOfString;
      }
      paramArrayOfString = new File(str.replace("-1", "-2"));
      if (paramArrayOfString.exists()) {
        localObject = paramArrayOfString;
      }
      paramArrayOfString = new File(str.replace("-1", ""));
      if (paramArrayOfString.exists()) {
        localObject = paramArrayOfString;
      }
      if (!((File)localObject).exists()) {
        throw new FileNotFoundException();
      }
    }
    catch (FileNotFoundException paramArrayOfString)
    {
      Object localObject;
      System.out.println("Error: Backup failed!");
      for (;;)
      {
        Utils.exitFromRootJava();
        return;
        Utils.copyFile((File)localObject, new File(((File)localObject).getAbsolutePath().replace("classes", "backup")));
        System.out.println("Backup - done!");
      }
    }
    catch (Exception paramArrayOfString)
    {
      for (;;)
      {
        System.out.println("Exception e" + paramArrayOfString.toString());
      }
    }
  }
}


/* Location:              /Users/sundayliu/Desktop/gamecheat/com.android.vending.billing.InAppBillingService.LACK-1/classes-dex2jar.jar!/com/chelpus/root/utils/live_backup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */