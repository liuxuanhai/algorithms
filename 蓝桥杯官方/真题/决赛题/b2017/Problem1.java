package 蓝桥杯官方.真题.决赛题.b2017;
/**
 * 标题：36进制
对于16进制，我们使用字母A-F来表示10及以上的数字。
如法炮制，一直用到字母Z，就可以表示36进制。
36进制中，A表示10，Z表示35，AA表示370
你能算出 MANY 表示的数字用10进制表示是多少吗?
请提交一个整数，不要填写任何多余的内容（比如，说明文字）
 * @author Raven
 *
 */
public class Problem1 {
	public static void main(String[] args) {
		System.out.println(Integer.toString(35, 36));
		System.out.println(Integer.valueOf("MANY", 36));
	}
}
