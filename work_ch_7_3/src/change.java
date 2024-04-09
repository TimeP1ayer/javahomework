public class change {

        private static String[] nums = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        // 单位还可以往上
        private static String[] CH_Nums = {"元", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰"};

        //函数开始
        public static String RMBchangeCH(String money) {

            StringBuilder res = new StringBuilder();
            String[] splitStr = money.split("\\.");
            if (splitStr.length > 2) {
                throw new RuntimeException("输入的参数不是数字！");
            }

            String front = splitStr[0];
            // 用于判定0的显示
            boolean isZero = true;

            if (front.length() > CH_Nums.length) {
                return "输入的参数:"+money+" 大于百亿！";
            }

            int dw;
            int index;
            int been8=0;

            for (int i = 0; i < front.length(); i++) {
                // 整数位处理
                dw = front.length() - i - 1;

                if (dw==8){
                    been8=1;
                }

                if(dw==4){
                }

                // 用ASCII码获得数字
                index = (front.charAt(i) - '0');
                if (index == 0) {
                    isZero = true;
                    if (dw == 0 || (dw == 4)  || dw == 8) {
                        // 元，万，亿需要拼接
                        if(dw==4&&been8==1){
                            //万前面直到亿一直都为0，则不添加万
                            if (front.charAt(5)=='0'&&front.charAt(6)=='0'&&front.charAt(7)=='0'){
                                //什么都不做
                            }
                        }else{
                            res.append(CH_Nums[dw]);
                        }

                    }
                } else {
                    if (isZero && i != 0) {
                        // 多个0只显示一个
                        res.append(nums[0]);
                    }
                    isZero = false;
                    res.append(nums[index]);
                    res.append(CH_Nums[dw]);
                }
            }

            return res.toString();
        }

    public static void main(String[] args) {
        System.out.println(change.RMBchangeCH("100000000"));
    }

    }

