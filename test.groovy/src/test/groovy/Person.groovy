package test.groovy

class Person {
	String firstName
	String lastName
	int age
	String address

	static void main(def args) {
		Person p = new Person()
		p.setFirstName('Saikat')
		p.setLastName('Gupta')
		p.setAge(40)
		p.setAddress('J 1886 CR Park')

		println ("First Name : " + p.getFirstName())
		println 'Last Name : ' + p.getLastName()
		println ('Age : ' + p.getAge())
		println ('Address : ' + p.getAddress())

		Person q = new Person(firstName:'Agnibha', lastName:'Gupta', age:3, address:'J 1886 Chittaranjan Park')

		println ("First Name : " + q.getFirstName())
		println 'Last Name : ' + q.getLastName()
		println ('Age : ' + q.getAge())
		println ('Address : ' + q.getAddress())

		if(p.getLastName()==q.getLastName()) {
			println('Same')
		}

		if(p.getLastName().is(q.getLastName())) {
			println 'Equal'
		}

		println 'Sum of 3 + 2 : ' + sum(3, 2)
		println 'Sum of 3 + 2 + 5 : ' + sum(3, 2, 5)
	}

	static sum(a, b, c=0) {
		a+b+c
	}
}
