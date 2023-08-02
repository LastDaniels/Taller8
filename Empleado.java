public class Empleado {
    private String nombre,departamento,genero;
    private double salarioBase;
    private int horasTrabajadas;
    private Departamento departamento;

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.departamento = departamento;}

    public double calcularSalario(){
	validarSalarioBase();
	validarHorasTrabajadas();
	double SalarioTotal=salarioBase+calcularHorasExtra();
        SalarioTotal+=departamento.calcularBonoPorDepartamento();
	return SalarioTota;}
    
    public void validarSalarioYHoras(){
	if(salarioBase<0){
	throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");}}

    public void validarHorasTrabajadas(){
	if(horasTrabajadas<0){
	throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");}}
    
    public double calcularHorasExtra(){
	if(horasTrabajadas>40){
	   return(horasTrabajadas-40)*50;}
	return 0;}


    //getters&setters

	
    //Se requiere crear una clase abstracta llamada departamento y las clases hijas (los distintos tipos de departamentos) implementaran, esto para respetar el OCP 
    
    public abstract class Departamento {
    public double abstract calcularBonoPorDepartamento();}

    class Sistemas extends Departamento{

	@Override
	public double calcularBono(){
		return 20;}}

    class Contabilidad extends Departamento{

	@Override
	public double calcularBonoPorDepartamento(){
		return 10;}}


	
 

    


    

    



















