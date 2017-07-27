/*
 * 文件名：FileController.java
 * 版权：Copyright by www.bonc.com.cn
 * 描述：
 * 修改人：xiyan
 * 修改时间：2017年7月21日
 */

package com.bonc.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bonc.utils.POIUtil;

@Controller
public class FileController {
    @ResponseBody
    @PostMapping("/uploadFile")
    public List<String[]> doFile(@RequestParam("excelFile")MultipartFile excelFile) throws IOException {
        
         List<String[]> userList = POIUtil.readExcel(excelFile);
          return userList;
        
    }

}
