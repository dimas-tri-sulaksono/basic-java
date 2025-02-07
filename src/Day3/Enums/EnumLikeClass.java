package Day3.Enums;

/* enum bisa juga kayak class : punya variable, constructor, sama method seperti */

public enum EnumLikeClass {
        SUNDAY("Weekend"), MONDAY("Weekday");

        private String type;

        EnumLikeClass(String type){
            this.type = type;
        }

        public String getType(){
            return type;
        }

}
