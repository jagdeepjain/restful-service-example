/**
 * @author jagdeepjain
 *
 */
package org.example.jagdeep.restful.service;

public class CoversionDTO {
        
        private int centigrade;
        private int fahrenheit;

        public CoversionDTO setCentigrade(int centigrade) {
            this.centigrade = centigrade;
            return this;
        }
     
        public CoversionDTO setFahrenheit(int fahrenheit) {
            this.fahrenheit = fahrenheit;
            return this;
        }
        
        public int getCentigrade() {
            return centigrade;
        }
        
        public int getFahrenheit() {
            return fahrenheit;
        }
     
    }
