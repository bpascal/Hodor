package com.codido.hodor.core.common.util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排列组合工具
 */
public class CaseComputUtils {

    /**
     * 排列算法
     *
     * @param s
     * @param ia
     * @param n
     */
    public static void permutation(String s, int[] ia, int n) {
        if (n == 1) {
            for (int i = 0; i < ia.length; i++) {
                System.out.println(s + ia[i]);
            }
        } else {
            for (int i = 0; i < ia.length; i++) {
                String ss = "";
                ss = s + ia[i] + "";
                // 建立没有第i个元素的子数组
                int[] ii = new int[ia.length - 1];
                int index = 0;
                for (int j = 0; j < ia.length; j++) {
                    if (j != i) {
                        ii[index++] = ia[j];
                    }
                }
                permutation(ss, ii, n - 1);
            }
        }
    }

    /**
     * 求组合算法
     *
     * @param s
     * @param ia
     * @param n
     */
    public static void combination(String s, int[] ia, int n) {
        if (n == 1) {
            for (int i = 0; i < ia.length; i++) {
                System.out.println(s + ia[i]);
            }
        } else {
            for (int i = 0; i < ia.length - (n - 1); i++) {
                String ss = "";
                ss = s + ia[i] + " ";
                // 建立从i开始的子数组
                int[] ii = new int[ia.length - i - 1];
                for (int j = 0; j < ia.length - i - 1; j++) {
                    ii[j] = ia[i + j + 1];
                }
                combination(ss, ii, n - 1);
            }
        }
    }

    /**
     * 构建组合STR
     *
     * @param s
     * @param ia
     * @param n
     * @return
     */
    public static List<String> combinationStr(String s, int[] ia, int n) {
        List<String> retList = new ArrayList<>();
        if (n == 1) {
            for (int i = 0; i < ia.length; i++) {
                //return s + ia[i];
                retList.add(s + (ia[i] < 10 ? ("0" + ia[i]) : ia[i]));
            }
        } else {
            for (int i = 0; i < ia.length - (n - 1); i++) {
                String ss = "";
                ss = s + (ia[i] < 10 ? ("0" + ia[i]) : ia[i]) + " ";
                // 建立从i开始的子数组
                int[] ii = new int[ia.length - i - 1];
                for (int j = 0; j < ia.length - i - 1; j++) {
                    ii[j] = ia[i + j + 1];
                }
                retList.addAll(combinationStr(ss, ii, n - 1));
            }
        }
        return retList;
    }

    /**
     * 计算组合数
     *
     * @return
     */
    public static int countCombination(int cNumber, int cCount) {
        int retVal = 0;
        if (cCount >= cNumber) {
            //当所选号码数>应选号码数时候，则进行计算，否则不进行计算
            retVal = factorial(cCount) / (factorial(cCount - cNumber) * factorial(cNumber));
        } else {
            retVal = 0;
        }
        return retVal;
    }


    /**
     * 阶乘函数
     *
     * @return
     */
    private static int factorial(int num) {
        if (num < 0) {
            return -1;
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    /**
     * 构建不加0的组合STR
     *
     * @param s 字符前缀
     * @param ia 组合来源数组
     * @param n 组合数
     * @return
     */
    public static List<String> combinationStrWithOut0(String s, int[] ia, int n) {
        List<String> retList = new ArrayList<>();
        if (n == 1) {
            for (int i = 0; i < ia.length; i++) {
                //return s + ia[i];
                retList.add(s + ia[i]);
            }
        } else {
            for (int i = 0; i < ia.length - (n - 1); i++) {
                String ss = "";
                ss = s + ia[i] + " ";
                // 建立从i开始的子数组
                int[] ii = new int[ia.length - i - 1];
                for (int j = 0; j < ia.length - i - 1; j++) {
                    ii[j] = ia[i + j + 1];
                }
                retList.addAll(combinationStrWithOut0(ss, ii, n - 1));
            }
        }
        return retList;
    }

    /**
     * 构建足彩单注号码列表
     *
     * @param chooseNumberStrSrc
     * @return
     */
    public static List<String> buildZcStrList(String beginStr, String chooseNumberStrSrc) {
        List<String> retList = new ArrayList<>();
        String[] chooseNumberArray = chooseNumberStrSrc.split(":");
        if (chooseNumberArray != null && chooseNumberArray.length > 1) {
            //有字串，就继续拆分
            String singleStr = chooseNumberArray[0];
            String nextChooseNumberStr = chooseNumberStrSrc.substring(singleStr.length() + 1);//取当前串的后面，作为下一阶段入参
            String[] singleStrs = singleStr.split(" ");
            int singleStrsSize = singleStrs.length;
            for (int i = 0; i < singleStrsSize; i++) {
                //外层循环取整个14场球
                String singleStrsItem = singleStrs[i];
                retList.addAll(buildZcStrList(beginStr + singleStrsItem + ":", nextChooseNumberStr));
            }
        } else if (chooseNumberArray != null && chooseNumberArray.length == 1) {
            String singleStr = chooseNumberArray[0];
            String[] singleStrs = singleStr.split(" ");
            int singleStrsSize = singleStrs.length;
            for (int i = 0; i < singleStrsSize; i++) {
                //外层循环取整个14场球
                String singleStrsItem = singleStrs[i];
                retList.add(beginStr + singleStrsItem);
            }
        }
        return retList;
    }

    /**
     * 测试方法
     *
     * @param args
     */
    public static void main(String[] args) {
//        String chooseNumberStr = "0 1:2 3:4 5:1 2 4:0 2 7 9";
//        List<String> numberList = buildPLLottoNumbers(chooseNumberStr);
//        System.out.println("计算结果共:" + numberList.size() + "注");
//        for (int i = 0; i < numberList.size(); i++) {
//            System.out.println("第" + i + "注是:" + numberList.get(i));
//        }
        String testStr = "0000000";
        String[] testArray = testStr.split("0");
        System.out.println(Arrays.toString(testArray));
    }


    /**
     * 构建号码组合
     *
     * @param chooseNumberStr
     * @return
     */
    public static List<String> buildPLLottoNumbers(String chooseNumberStr) {
        List<String> retList = new ArrayList<>();
        //做号码转换，将入参的字符转为二维数组
        String[] chooseNumberGroupsArray = chooseNumberStr.split(":");//第一层，有多少个号码区
        String[][] allNumbersArray = new String[chooseNumberGroupsArray.length][];
        for (int i = 0; i < chooseNumberGroupsArray.length; i++) {
            String[] theLineArray = chooseNumberGroupsArray[i].split(" ");
            int[] theLineIntArray = new int[theLineArray.length];
            if (theLineArray.length > 0) {
                for (int x = 0; x < theLineArray.length; x++) {
                    theLineIntArray[x] = Integer.valueOf(theLineArray[x]);
                }
            }
            List<String> simpleNumberList = combinationStrWithOut0("", theLineIntArray, 1);
            allNumbersArray[i] = simpleNumberList.toArray(new String[simpleNumberList.size()]);
        }
        retList = combine(allNumbersArray, allNumbersArray.length);
        return retList;
    }


    /**
     * 生成排列型彩票单注号码
     *
     * @param data
     * @param n
     * @return
     */
    public static List<String> combine(String[][] data, int n) {
        if (n > data.length) {
            n = data.length;
        }
        int[] idx = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            if (i < data.length - n) {
                idx[i] = 0;
            } else {
                idx[i] = 1;
            }
        }
        List<String> retList = new ArrayList<>();
        while (idx[0] < 2) {
            int cnt = 0, dig = 0;
            int[] gp = new int[n];
            for (int i = 0; i < idx.length; i++) {
                if (idx[i] == 1) {
                    if (i < n) {
                        dig++;
                    }
                    if (cnt < n) {
                        gp[cnt] = i;
                    }
                    cnt++;
                }
            }
            if (n == cnt) {
                int[] subIdx = new int[n];
                Arrays.fill(subIdx, 0);
                while (subIdx[0] < data[gp[0]].length) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < n; i++) {
                        sb.append(data[gp[i]][data[gp[i]].length - subIdx[i] - 1]);
                        if (i < n - 1) {
                            sb.append(":");
                        }
                    }
                    retList.add(0, sb.toString());

                    subIdx[n - 1]++;
                    for (int i = n - 1; i > 0; i--) {
                        if (subIdx[i] == data[gp[i]].length) {
                            subIdx[i] = 0;
                            subIdx[i - 1]++;
                        } else {
                            break;
                        }
                    }
                }
            }
            if (dig == n) {
                break;
            }

            idx[data.length - 1]++;
            for (int i = data.length - 1; i > 0; i--) {
                if (idx[i] == 2) {
                    idx[i] = 0;
                    idx[i - 1]++;
                } else {
                    break;
                }
            }

        }
        return retList;
    }
}
