package com.javalab.homeworks;

public class OrderData {
        private int num; // 주문번호
        private String day; // 주문날짜
        private int id; // 주무처리직원 id
        private int pd; // 판맨상품id
        private int quantity; // 판매수량

    public OrderData() {

    }


    public OrderData( int num, String day,int id, int pd, int quantity){
            this.num = num;
            this.day = day;
            this.id = id;
            this.pd = pd;
            this.quantity = quantity;
        }



        public int getNum () {
            return num;
        }

        public void setNum ( int num){
            this.num = num;
        }

        public String getDay () {
            return day;
        }

        public void setDay (String day){
            this.day = day;
        }

        public int getId () {
            return id;
        }

        public void setId ( int id){
            this.id = id;
        }

        public int getPd () {
            return pd;
        }

        public void setPd ( int pd){
            this.pd = pd;
        }

        public int getQuantity () {
            return quantity;
        }

        public void setQuantity ( int quantity){
            this.quantity = quantity;
        }

    }

