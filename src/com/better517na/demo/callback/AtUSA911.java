/*
 * 文件名：AtUSA911.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： AtUSA911.java
 * 修改人：duanji
 * 修改时间：2015年12月29日
 * 修改内容：新增
 */
package com.better517na.demo.callback;

import java.text.SimpleDateFormat;
import java.util.Date;

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
public class AtUSA911 implements BoomWTC {

    private boolean decide;

    private TerroristAttack ta;
    // 相当于【背景2】

    public AtUSA911() {
        Date dt = new Date();
        SimpleDateFormat myFmt = new SimpleDateFormat("yy/MM/dd HH:mm");
        this.decide = myFmt.format(dt).equals("01/09/11 09:44");
        this.ta = new TerroristAttack();
    }

    // 获得拉登的决定
    public boolean benLaDengDecide() {
        return decide;
    }

    // 执行轰炸世贸
    public void boom() {
        ta.attack(new AtUSA911());
        // class A调用class B的方法传入自己的对象，相当于【you call me】
    }
}
