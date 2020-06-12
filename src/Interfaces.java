public interface Interfaces {
    //  INTERFACES
//  are used for achieving abstraction
//  we can store abstract methods

//  we can have
//  methods: abstract method, static method, default method
//  variables: public static final automatically

//  can can not have
//  methods: constructor, instance methods
//  variables: instance variable
//  blocks: static initializer block, instance initializer block

//  Restrictions of abstract method
//  can not have body
//  can have private access modifiers
//  can not have static and final specifier

}
interface Cars{abstract void start();}
interface ElectricVehicles{abstract void Charge();abstract void SelfDrive();}
interface GasVehicles{abstract void PumpGas();}
//