package ua.lviv.iot.Lab8;

import javax.persistence.*;

    @Entity
    @Table(name = "attraction")
    public class Attraction {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        @Column(name = "priceOfTicket")
        private double priceOfTicket;
        @Column(name = "maxNumberOfVisitors")
        private int maxNumberOfVisitors;
        @Column(name = "dangerLevel")
        private DangerLevel dangerLevel;

        public Attraction(final double priceOfTicket, final int maxNumberOfVisitors, final DangerLevel dangerLevel) {
            this.priceOfTicket = priceOfTicket;
            this.maxNumberOfVisitors = maxNumberOfVisitors;
            this.dangerLevel = dangerLevel;
        }

        public Attraction() {
        }

        public final double getPriceOfTicket() {
            return priceOfTicket;
        }

        public final void setPriceOfTicket(final double priceOfTicket) {
            this.priceOfTicket = priceOfTicket;
        }

        public final int getMaxNumberOfVisitors() {
            return maxNumberOfVisitors;
        }

        public final void setMaxNumberOfVisitors(final int maxNumberOfVisitors) {
            this.maxNumberOfVisitors = maxNumberOfVisitors;
        }

        public final DangerLevel getDangerLevel() {
            return dangerLevel;
        }

        public final void setDangerLevel(final DangerLevel dangerLevel) {
            this.dangerLevel = dangerLevel;
        }

        @Override
        public final String toString() {
            return super.toString() + "Attraction [priceOfTicket=" + priceOfTicket + ", maxNumberOfVisitors="
                    + maxNumberOfVisitors + ", dangerlevel=" + dangerLevel + "]";
        }
    }


