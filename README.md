## 1.目录

[TOC]



## 2.详情

### 2.1 按算法分类

| 算法名                                      | 算法描述          |
| :--------------------------------------- | :------------ |
| [BFS.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/BFS.java) | 图的深度遍历        |
| [DFS.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/DFS.java) | 图的广度遍历        |
| [Dijkstra.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/Dijkstra.java) | 单源最短路径算法      |
| [Floyd.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/Floyd.java) | 全局最短路径算法-动态规划 |
| [Kursal.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/Kursal.java) | 最小生成树算法-从边入手  |
| [Prim.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/Prim.java) | 最小生成树算法-从点入手  |
| [WarShall.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/WarShall.java) | 闭包算法-动态规划     |
| [BackTrack.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/BackTrack.java) | 回溯法（0-1背包问题）  |
| [BestBinarySearchTree.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/BestBinarySearchTree.java) | 最优二叉查找树（动态规划） |
| [Bissearch.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/Bissearch.java) | 折半查找          |
| [MergeSort.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/MergeSort.java) | 合并排序（分治法）     |
| [FastSort.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/FastSort.java) | 快速排序（分治法）     |
| [HaffuManTree.java](https://github.com/zzbb1199/Algorithms/blob/master/algorithm/HaffuManTree.java) | 哈弗曼树及哈弗曼编码    |



#### 2.1.1 BFS-图的广度遍历

代码中使用的图为：

![BFS](https://github.com/zzbb1199/Algorithms/blob/master/picture/BFS%26DFS)

邻接矩阵:

```java
{0,1,1,1,0,0},
{1,0,1,0,1,0},
{1,1,0,1,1,1},
{1,0,1,0,0,1},
{0,1,1,0,0,1},
{0,0,1,1,1,0}
```



#### 2.1.2 DFS-图的广度遍历

代码中使用的图为：

![DFS](https://github.com/zzbb1199/Algorithms/blob/master/picture/BFS%26DFS)

邻接矩阵：

```java
{0,1,1,1,0,0},
{1,0,1,0,1,0},
{1,1,0,1,1,1},
{1,0,1,0,0,1},
{0,1,1,0,0,1},
{0,0,1,1,1,0}
```
#### 2.1.3 Dijkstra算法

> 单源最短路径算法，可求得在一个图中一个点到其余任意节点的最小距离及所经路径。

代码中使用的图为：

![Dijkstra](https://github.com/zzbb1199/Algorithms/blob/master/picture/Dijkstra%26Floyd%26K%26P)

邻接矩阵：

```java
{ 0, 6, 1, 5, INF, INF },
{ 6, 0, 5, INF, 3, INF },
{ 1, 5, 0, 5, 6, 4 },
{ 5, INF, 5, 0, INF, 2 }, 
{ INF, 3, 6, INF, 0, 6 }, 
{ INF, INF, 4, 2, 6, 0 }
```

#### 2.1.4 Floyd算法

> Floyd算法是另一类最短路径算法，和D算法不同的是，Floyd算法所能求得的是全局任意两点之间的最短路径。

在代码中使用的图为：

![Floyd](https://github.com/zzbb1199/Algorithms/blob/master/picture/Dijkstra%26Floyd%26K%26P)

邻接矩阵:

```java
{ 0, 6, 1, 5, INF, INF },
{ 6, 0, 5, INF, 3, INF },
{ 1, 5, 0, 5, 6, 4 },
{ 5, INF, 5, 0, INF, 2 }, 
{ INF, 3, 6, INF, 0, 6 }, 
{ INF, INF, 4, 2, 6, 0 }
```



#### 2.1.4 Kursal算法

> Kursal算法为最小生成树算法的一种，其思想从边入手，在代码中为检查是否形成环，使用到了压缩路径的并查集。

代码中的图为：

![Kursal](https://github.com/zzbb1199/Algorithms/blob/master/picture/Dijkstra%26Floyd%26K%26P)

邻接矩阵:

```java
{ 0, 6, 1, 5, INF, INF },
{ 6, 0, 5, INF, 3, INF },
{ 1, 5, 0, 5, 6, 4 },
{ 5, INF, 5, 0, INF, 2 }, 
{ INF, 3, 6, INF, 0, 6 }, 
{ INF, INF, 4, 2, 6, 0 }
```

#### 2.1.5 Prim算法

> Prim算法是另一种最小生成树算法，该算法的核心思想从边入手，每次加入一个点。在实际操作中，推荐使用该算法（因为不用使用到并查集这种额外的数据结构）。

在代码中使用到的图为：

![Prim](https://github.com/zzbb1199/Algorithms/blob/master/picture/Dijkstra%26Floyd%26K%26P)

邻接矩阵：

```java
{ 0, 6, 1, 5, INF, INF },
{ 6, 0, 5, INF, 3, INF },
{ 1, 5, 0, 5, 6, 4 },
{ 5, INF, 5, 0, INF, 2 }, 
{ INF, 3, 6, INF, 0, 6 }, 
{ INF, INF, 4, 2, 6, 0 }
```
#### 2.1.6 WarShall算法

> WarShall算法为一种传递闭包的算法，可用在游戏开发，检验人物是否能到达某个地点。

在代码中使用到的图为：

![WarShall](https://github.com/zzbb1199/Algorithms/blob/master/picture/WarShall)

邻接矩阵:

```java
{0,1,0,1,0,0},
{1,0,1,0,0,0},
{0,1,0,0,0,0},
{1,0,0,0,1,0},
{0,0,0,1,0,0},
{0,0,0,0,0,0}
```


#### 2.1.7 BackTrack算法

> 回溯算法，是一种非常有用的算法，甚至有“通用解法”的美称。关于回溯算法更多介绍，可看[我的博文](https://www.jianshu.com/p/f6d3732e86fb)

在代码中，使用N皇后和0-1背包问题进行说明。

#### 2.1.8 BestBinarySearchTree算法

> 最右二叉查找树：给定一个有序序列K={k1<k2<k3<,……,<kn}和他们被查询的概率P={p1,p2,p3,……,pn}，要求构造一棵二叉查找树T，使得查询所有元素的总的代价最小。

#### 2.1.9 Bissearch算法

> 二分查找也称为折半查找，是一种高效率的查找算法，不过它要求数组是有序的。



#### 2.1.10 MergeSort算法

> 基于分治法的排序算法之一，时间复杂度低。



#### 2.1.11 FastSort算法

> 基于分治法的排序算法之一，时间复杂度低。



#### 2.1.12 HaffuManTree算法

> 给定n个权值作为n个叶子结点，构造一棵二叉树，若带权路径长度达到最小，称这样的二叉树为最优二叉树，也称为哈夫曼树(Huffman Tree)。哈夫曼树是带权路径长度最短的树，权值较大的结点离根较近。常用编码中。





### 2.2 按问题分类

| 问题名                                      | 问题描述            |
| ---------------------------------------- | --------------- |
| [NQueen.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/NQueen.java) | N皇后问题，回溯法解决     |
| [TwoQueen.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/base/pratice/TwoQueen.java) | 2n皇后问题，回溯法解决    |
| [KnapsackB.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/KnapsackB.java) | 0-1背包问题，回溯法解决   |
| [KnapsackD.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/KnapsackD.java) | 0-1背包问题，动态规划解决  |
| [KMinSelect.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/KMinSelect.java) | 第K小问题           |
| [LongestSequence.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/LongestSequence.java) | 最长子序列问题         |
| [LongestSubstring.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/LongestSubstring.java) | 最长公共子串问题        |
| [HexadecimalConversion.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/HexadecimalConversion.java) | 大数据的16进制转化到8进制  |
| [SymbolicTriangle.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/SymbolicTriangle.java) | 符号三角形问题         |
| [Factorial.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/base/pratice/Factorial.java) | 大数阶乘            |
| [LargeSum.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/base/pratice/LargeSum.java) | 大数相加            |
| [NumberRead.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/base/pratice/NumberRead.java) | 读数              |
| [TimeRead.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/base/pratice/TimeRead.java) | 读时间             |
| [PalindromeeCorrection.java](https://github.com/zzbb1199/Algorithms/blob/master/problems/base/pratice/PalindromeeCorrection.java) | 使用最小交换次数纠正回文字符串 |

#### 2.2.1NQueen & 2NQueen

> 一个ｎ×ｎ的国际象棋棋盘上放置ｎ个皇后，使其不能相互攻击，即任何两个皇后都不能处在棋盘的同一行、同一列、同一条斜线上，试问共有多少种摆法？

常用n=8，解答为92种 。

> 　**问题描述**
>
> 　给定一个n*n的棋盘，棋盘中有一些位置不能放皇后。现在要向棋盘中放入n个黑皇后和n个白皇后，使任意的两个黑皇后都不在同一行、同一列或同一条对角线上，任意的两个白皇后都不在同一行、同一列或同一条对角线上。问总共有多少种放法？n小于等于8。
>
> **输入格式**
>
> 　　输入的第一行为一个整数n，表示棋盘的大小。
> 　　接下来n行，每行n个0或1的整数，如果一个整数为1，表示对应的位置可以放皇后，如果一个整数为0，表示对应的位置不可以放皇后。
>
> **输出格式**
>
> 　　输出一个整数，表示总共有多少种放法。

#### 2.2.2 0-1背包问题

> 给定n种物品和一背包。物品i的重量是wi，其价值为vi，背包的容量为C。问应如何选择装入背包的物品，使得装入背包中物品的总价值最大?

常用的方法有：[回溯法](https://github.com/zzbb1199/Algorithms/blob/master/problems/KnapsackB.java),[动态规划](https://github.com/zzbb1199/Algorithms/blob/master/problems/KnapsackD.java)，分支界限法。

#### 2.2.3 第K小问题

> 给定一组随机数据，查找这个数据中的第K小元素的值。

#### 2.2.4 最长子序列问题

> 给定两个字符串，求解两个字符串中的最长子序列的长度及该子序列。（注意和最长公共子串的不同）。如“abcdef"和“abdcef”。那么最长子序列的长度为5，为"abcef"和"abdef"。

#### 2.2.5 最长公共子串问题

> 给定两个字符串，求解两个字符串中最长的公共子串，注意和最长子序列问题的不同。如“abcefg"和"abegfc"中的最大公共子串为"ab"。

#### 2.2.6 大数据中的16进制转换到8进制

> 输入16进制数转换到8进制。由于数据量很大，不能使用Integer.valueOf()等方法，所以这里采用8421BCD码进行转换。

#### 2.2.7 符号三角形问题

>  在一般情况下，符号三角形的第一行有n个符号。符号三角形问题，要求对于给定的n，计算有多少个不同的符号三角形，使其所含的“+”和“-”相同。

#### 2.2.8 大数阶乘

> 计算类似1000！之类的结果，采用数组进位实现

#### 2.2.9 大数相加

> #### 计算100+位的两位相加，采用数组进位实现（对于Java，可以使用大整数类实现）

#### 2.2.10 读数

>  **问题描述**
> 　　Tom教授正在给研究生讲授一门关于基因的课程，有一件事情让他颇为头疼：一条染色体上有成千上万个碱基对，它们从0开始编号，到几百万，几千万，甚至上亿。
> 　　比如说，在对学生讲解第1234567009号位置上的碱基时，光看着数字是很难准确的念出来的。
> 　　所以，他迫切地需要一个系统，然后当他输入12 3456 7009时，会给出相应的念法：
> 　　十二亿三千四百五十六万七千零九
> 　　用汉语拼音表示为
> 　　shi er yi san qian si bai wu shi liu wan qi qian ling jiu
> 　　这样他只需要照着念就可以了。
> 　　你的任务是帮他设计这样一个系统：给定一个阿拉伯数字串，你帮他按照中文读写的规范转为汉语拼音字串，相邻的两个音节用一个空格符格开。
> 　　注意必须严格按照规范，比如说“10010”读作“yi wan ling yi shi”而不是“yi wan ling shi”，“100000”读作“shi wan”而不是“yi shi wan”，“2000”读作“er qian”而不是“liang qian”。

#### 2.2.11 读时间

> **问题描述**
> 　　给定当前的时间，请用英文的读法将它读出来。
> 　　时间用时h和分m表示，在英文的读法中，读一个时间的方法是：
> 　　如果m为0，则将时读出来，然后加上“o'clock”，如3:00读作“three o'clock”。
> 　　如果m不为0，则将时读出来，然后将分读出来，如5:30读作“five thirty”。
> 　　时和分的读法使用的是英文数字的读法，其中0~20读作：
>
> 　　对于大于20小于60的数字，首先读整十的数，然后再加上个位数。如31首先读30再加1的读法，读作“thirty one”。
> 　　按上面的规则21:54读作“twenty one fifty four”，9:07读作“nine seven”，0:15读作“zero fifteen”。
> **输入格式**
> 　　输入包含两个非负整数h和m，表示时间的时和分。非零的数字前没有前导0。h小于24，m小于60。
> **输出格式**
> 　　输出时间时刻的英文。

#### 2.2.12 回文纠正

> **问题描述**
>
> 回文串，是一种特殊的字符串，它从左往右读和从右往左读是一样的。小龙龙认为回文串才是完美的。现在给你一个串，它不一定是回文的，请你计算最少的交换次数使得该串变成一个完美的回文串。
> 　　交换的定义是：交换两个相邻的字符
> 　　例如mamad
> 　　第一次交换 ad : mamda
> 　　第二次交换 md : madma
> 　　第三次交换 ma : madam (回文！完美！)
>
> **输入格式**
>
> 　　第一行是一个整数N，表示接下来的字符串的长度(N <= 8000)
> 　　第二行是一个字符串，长度为N.只包含小写字母
>
> **输出格式**
>
> 　　如果可能，输出最少的交换次数。
> 　　否则输出Impossible