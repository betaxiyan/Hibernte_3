/*
 * 文件名：ssss.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：xiyan
 * 修改时间：2017年7月21日
 */

package com.bonc.test;
import java.io.IOException;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;

import com.bonc.utils.Excel2003Utils;

/**
 * Excel2003Test
 * Created by jianwei.zhou on 2016/11/9.
 */
public class Excel2003Test {

    public static void main(String[] args) throws IOException {
        String sheetName = "测试Excel格式";
        String sheetTitle = "测试Excel格式";
        List<String> columnNames = new LinkedList<>();
        
        columnNames.add("日期-String");
        columnNames.add("日期-Date");
        columnNames.add("时间戳-Long");
        columnNames.add("客户编码");
        columnNames.add("整数");
        columnNames.add("带小数的正数");
        
       
        //写入标题--第二种方式
       Excel2003Utils.writeExcelTitle("E:\\temp", "a", sheetName, columnNames, sheetTitle,false);
       // Excel2003Utils.writeExcelTitle("E:\\temp", "a", null, null, null,false);

        List<List<Object>> objects = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            List<Object> dataA = new LinkedList<>();
            dataA.add("2016-09-05 17:27:25");
            dataA.add(new Date(1451036631012L));
            dataA.add(1451036631012L);
            dataA.add("000628");
            dataA.add(i);
            dataA.add(null);
            dataA.add(1.323 + i);
            objects.add(dataA);
        }
        try {
            //写入数据--第二种方式
            Excel2003Utils.writeExcelData("E:\\temp", "a", sheetName, objects);

            //直接写入数据--第一种方式
            Excel2003Utils.writeExcel("E:\\temp", "b", sheetName, columnNames, sheetTitle, objects, false);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


