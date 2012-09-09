import concurrent.ops.spawn

object BooleanHolder {
	@volatile var value: Boolean = false;
}


spawn {
	Thread.sleep(100);
	BooleanHolder.value = true
	println("Thread1: setting value to TRUE!")
} 

spawn {
	while(!BooleanHolder.value) Thread.sleep(20);
	println("Thread2: value is TRUE!")	
}
