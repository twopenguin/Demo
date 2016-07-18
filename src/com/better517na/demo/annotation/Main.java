/*
 * 文件名：Main.java
 * 版权：Copyright 2007-2016 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： Main.java
 * 修改人：duanji
 * 修改时间：2016年6月22日
 * 修改内容：新增
 */
package com.better517na.demo.annotation;

import org.junit.Test;

import com.dobby.plugins.Generator;
import com.dobby.plugins.config.GeneratorConfig;
import com.dobby.plugins.object.EntityTable;
import com.dobby.plugins.utils.BeanUtils;

/**
 * TODO 添加类的一句话简单描述.
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * 
 * <pre>
 * </pre>
 * 
 * @author duanji
 */
public class Main {

    public static void main(String[] args) {

        GeneratorConfig config = new GeneratorConfig();
        // 代码根路径
        config.setSrcRoot("src");

        // 扫描的包,默认支持递归扫描该包下的东西
        config.setScanBaseModelPackage("com.better517na.demo.annotation.model");
        config.setEncoding("UTF-8");
        // 生成的代码存放的包
        config.setCodeGeneratorPackage("com.better517na.demo.annotation.autocode");
        // 如果生成的类文件已经存在,是否覆盖
        config.setCodeExistsOverride(false);
        // 生成注解代码
        config.setAnnotationSupport(true);

        // 使用插件生成
        new Generator(config).generatorCode();

        // List<String> packageWithClasses = ScanUtils.scanPackageClasses(config.getSrcRoot(), config.getScanBaseModelPackage(), config.isScanBaseModelRecursive());
        // System.out.println(packageWithClasses);
    }

    @Test
    public void testEntityTable() {
        String packageName = "com.better517na.demo.annotation.model.Member.java";

        String className = BeanUtils.getClassName(packageName);
        System.out.println("类名 : " + className);

        System.out.println("首字母小写 : " + BeanUtils.firstLower(className));

        System.out.println("首字母大写 : " + BeanUtils.firstUpper(className));

        String innerVar = "password";

        System.out.println("setXX : " + BeanUtils.setterName(innerVar));

        System.out.println("getXX : " + BeanUtils.getterName(innerVar));

        EntityTable entityTable = BeanUtils.constructEntityTableWithPath("com.better517na.demo.annotation.model.Member");
        System.out.println("主键映射" + entityTable.getPropertyToPKey());
        System.out.println("字段映射" + entityTable.getPropertyToColumn());
        System.out.println("主键集合" + entityTable.getPropertyPKeyType());
        System.out.println("表名映射" + entityTable.getEntityToTable());
    }

}
