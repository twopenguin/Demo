/*
 * 文件名：TerroristAttack.java
 * 版权：Copyright 2007-2015 517na Tech. Co. Ltd. All Rights Reserved. 
 * 描述： TerroristAttack.java
 * 修改人：duanji
 * 修改时间：2015年12月29日
 * 修改内容：新增
 */
package com.better517na.demo.callback;

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
public class TerroristAttack {

    public TerroristAttack() {
    }

    public boolean attack(BoomWTC bmw) {
        // ——这相当于【背景3】
        if (bmw.benLaDengDecide()) {
            // class B在方法中回调class A的方法，相当于【i call you back】
            // let's go.........
        }
        return true;
    }

}
