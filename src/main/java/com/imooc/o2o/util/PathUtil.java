package com.imooc.o2o.util;

public class PathUtil {
    private static String separator = System.getProperty("file.separator");
    public static String getImgBasePath(){
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")){
            basePath = "C:/workspace/image";
        }else {
            basePath = "/Users/mac/Documents";
        }
        basePath = basePath.replace("/", separator);
        return basePath;
    }

    public static String getShopImagePath(Long shopId){
        String imagePath = "upload/item/shop/" + shopId + "/";
        return imagePath.replace("/", separator);
    }
}
