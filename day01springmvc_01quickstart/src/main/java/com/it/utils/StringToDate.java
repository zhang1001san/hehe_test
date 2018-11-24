package com.it.utils;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义类型转换器
 * 字符串转换为日期格式的数据
 * @创建人 Administrator
 * @创建时间 2018/8/18
 * @描述
 */
public class StringToDate implements Converter<String,Date> {

    /**
     * 字符串转换为日期格式
     * @param source
     * @return
     */
    @Override
    public Date convert(String source) {

/*        if (source == null ||"".equals(source.trim())) {
            throw  new RuntimeException("字符串不能为空");
        }

        System.out.println("source:"+source);*/
        //如果是字符串格式形如2010-4-2
        SimpleDateFormat sdf= null;
        if(source.contains("-")){
            sdf= new SimpleDateFormat("yyyy-MM-dd");
        }else{
            //如果是字符串格式形如2010/4/2
            sdf = new SimpleDateFormat("yyyy/MM/dd");
        }
        try {
            Date date = sdf.parse(source);
            return  date;
        } catch (ParseException e) {
            throw  new RuntimeException(e);
        }

    }
}
