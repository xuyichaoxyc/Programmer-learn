# 设计一个具有 getMin 功能的栈

## 问题
实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作

## 要求
1. pop、push、getMin 操作的时间复杂度都是 O(1)
2. 设计的栈类型可以使用现成的栈结构

## 解答

### 思路一
采用两个栈，栈 stackData 以及 栈 stackMin
其中 stackData 正常存放数据，stackMin 存放栈中最小值

入栈：
+ 值压入 stackData
+ 判断 stackMin 是否为空
  + 如果为空，值压入 stackMin 
  + 如果不为空，判断值与 stackMin 栈顶值大小
    + 如果值小或者相等，则压入 stackMin
    + 否则，不压入
    
出栈：
+ 取 stackData 栈顶值与 stackMin 栈顶值 比较
    + 如果相等，stackData 与 stackMin 弹栈
    + 如果不等，仅 stackData 弹栈

getMin：
+ 取 getMin 栈顶值

### 思路二
同样采用两个栈，栈 stackData 以及 栈 stackMin
其中 stackData 正常存放数据，stackMin 存放栈中最小值

入栈：
+ 值压入 stackData
+ 判断 stackMin 是否为空
    + 如果为空，值压入 stackMin
    + 如果不为空，判断值与 stackMin 栈顶值大小
        + 如果值小或者相等，则压入 stackMin
        + 否则，stackMin栈顶值再压入一次
    
出栈：
+ stackData 与 stackMin 弹栈

getMin：
+ 取 stackMin 栈顶值