package cainiao_lean.基本数据类型;

public class QiangZhiZhuanHuan {
    public static void main(String[] args){
        int i1 = 127;
        byte b = (byte) i1;
        float f = 0.11f;
        double d = 0.22112;
        System.out.println("int强制类型转换为byte后的值等于 " + b);
        System.out.println(String.format("byte 最大值为%s， 最小值为： %s", Byte.MAX_VALUE, Byte.MIN_VALUE));
        System.out.println(String.format("%f, %f", f ,d));
        String mingdanji_id = "1";
        String a = String.format("{\n" +
                "\t\"children\": [{\n" +
                "\t\t\"logicOperator\": \"&&\",\n" +
                "\t\t\"property\": \"watchlist/customList\",\n" +
                "\t\t\"operator\": \"==\",\n" +
                "\t\t\"value\": \"1\",\n" +
                "\t\t\"type\": \"alias\",\n" +
                "\t\t\"description\": \"\",\n" +
                "\t\t\"propertyDataType\": \"\",\n" +
                "\t\t\"children\": [],\n" +
                "\t\t\"describe\": \"是否命中名单\",\n" +
                "\t\t\"params\": [{\n" +
                "\t\t\t\"name\": \"calcField\",\n" +
                "\t\t\t\"type\": \"string\",\n" +
                "\t\t\t\"value\": \"S_S_CUSTNAME\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"name\": \"definitionList\",\n" +
                "\t\t\t\"type\": \"string\",\n" +
                "\t\t\t\"value\": %s\n" +
                "\t\t}, {\n" +
                "\t\t\t\"name\": \"conditionValue\",\n" +
                "\t\t\t\"type\": \"int\",\n" +
                "\t\t\t\"value\": \"1\"\n" +
                "\t\t}]\n" +
                "\t}],\n" +
                "\t\"logicOperator\": \"&&\"\n" +
                "}", mingdanji_id);
        System.out.println(a);
    }
}