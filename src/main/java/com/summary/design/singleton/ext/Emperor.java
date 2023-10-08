package com.summary.design.singleton.ext;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author scq
 * 扩展：指定数量的单例模式
 */
public class Emperor {

    // 定义最多能产生的实例数量
    private static int maxNumOfEmperor = 2;
    // 每个皇帝都有名字，使用一个ArrayList来容纳，每个对象的私有属性
    private static ArrayList<String> nameList = new ArrayList<>();
    // 定义一个列表，容纳所有的皇帝实例
    private static ArrayList<Emperor> emperorList = new ArrayList<>();
    // 当前皇帝序列号
    private static int countNumOfEmperor = 0;
    // 产生所有的对象
    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("emperor" + i));
        }
    }

    private Emperor() {

    }

    private Emperor(String name) {
        nameList.add(name);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
