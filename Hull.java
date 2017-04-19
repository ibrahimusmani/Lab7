/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softcons.lab7.model;

/**
 *
 * @author ibrah
 */
import javax.persistence.*;
@Entity
@Table(name = "hulldata")
public class Hull {
    @Id
    private int id;
    @Column
    private String USERID;
    @Column
    private String SCHEME;
    @Column
    private double tTime;
    @Column
    private String State;
    @Column
    private double firstTime;
    @Column
    private String State1;
    @Column
    private double SecondTime;
    @Column
    private String State2;
    @Column
    private double thirdTime;
    @Column
    private String State3;
    @Column
    private double fourthTime;
    @Column
    private String State4;
    @Column
    private double fifthTime;

    public void setId(int id) {
        this.id = id;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }

    public void setSCHEME(String SCHEME) {
        this.SCHEME = SCHEME;
    }

    public void settTime(double tTime) {
        this.tTime = tTime;
    }

    public void setState(String State) {
        this.State = State;
    }

    public void setFirstTime(double firstTime) {
        this.firstTime = firstTime;
    }

    public void setState1(String State1) {
        this.State1 = State1;
    }

    public void setSecondTime(double SecondTime) {
        this.SecondTime = SecondTime;
    }

    public void setState2(String State2) {
        this.State2 = State2;
    }

    public void setThirdTime(double thirdTime) {
        this.thirdTime = thirdTime;
    }

    public void setState3(String State3) {
        this.State3 = State3;
    }

    public void setFourthTime(double fourthTime) {
        this.fourthTime = fourthTime;
    }

    public void setState4(String State4) {
        this.State4 = State4;
    }

    public void setFifthTime(double fifthTime) {
        this.fifthTime = fifthTime;
    }

    public void setState5(String State5) {
        this.State5 = State5;
    }

    public void setSixthTime(double sixthTime) {
        this.sixthTime = sixthTime;
    }

    public void setState6(String State6) {
        this.State6 = State6;
    }

    public void setSeventhTime(double seventhTime) {
        this.seventhTime = seventhTime;
    }

    public void setState7(String State7) {
        this.State7 = State7;
    }

    public int getId() {
        return id;
    }

    public String getUSERID() {
        return USERID;
    }

    public String getSCHEME() {
        return SCHEME;
    }

    public double gettTime() {
        return tTime;
    }

    public String getState() {
        return State;
    }

    public double getFirstTime() {
        return firstTime;
    }

    public String getState1() {
        return State1;
    }

    public double getSecondTime() {
        return SecondTime;
    }

    public String getState2() {
        return State2;
    }

    public double getThirdTime() {
        return thirdTime;
    }

    public String getState3() {
        return State3;
    }

    public double getFourthTime() {
        return fourthTime;
    }

    public String getState4() {
        return State4;
    }

    public double getFifthTime() {
        return fifthTime;
    }

    public String getState5() {
        return State5;
    }

    public double getSixthTime() {
        return sixthTime;
    }

    public String getState6() {
        return State6;
    }

    public double getSeventhTime() {
        return seventhTime;
    }

    public String getState7() {
        return State7;
    }
    private String State5;
    private double sixthTime;
    private String State6;
    private double seventhTime;
    private String State7;
    
    
}
