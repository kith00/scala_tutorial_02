// Question 01 and Question 2

var k,i,j =2;
var m,n =5;
var f=12.0f;
var g=4.0f;
var c='X';

// Question 03 [1]

k+12*m;
m/j;
n%j;
m/j*j;
f+10*5+g;

// Question 03 [2]

var a=2;
var b=3;
var c=4;
var d=5;
var k=4.3f;

b=b-1;
println(b*a+c*d);
d=d-1;

println(a);
a=a+1;

println(-2*(g-k)+c);

println(c);
c=c+1;

c=c+1;
println(c*a);
a=a+1;

// Question 04
// (a)

val SalaryForWorkingHour = 250.00f
val SalaryForOTHour =85.00f
val TypicalWorkingHoursPerWeek =40
val TypicalOTHoursPerWeek = 30
val TaxRate =0.12f

def Checking(WorkingHours: Int, OTHours: Int): Boolean = WorkingHours <= TypicalWorkingHoursPerWeek && OTHours <= TypicalOTHoursPerWeek
def TotalSalary(WorkingHours: Int, OTHours: Int): Float=(WorkingHours * SalaryForWorkingHour) + (OTHours * SalaryForOTHour)
def Tax(TotalSalary: Float): Float = TotalSalary * TaxRate
def TakeHomeSalary(TotalSalary: Float, Tax: Float) : Float = TotalSalary-Tax

def CalculateSalary(WorkingHours: Int, OTHours: Int) : Float = if(Checking(WorkingHours,OTHours)){
 val totalsalary = TotalSalary(WorkingHours,OTHours)
 val tax = Tax(totalsalary)
 TakeHomeSalary(totalsalary,tax)
}
else {
  0.0f
}

println("Take home sallary :")
CalculateSalary(15,10)

// (b)

val CostForEachPerformance = 500.00f
val CostForEachAttendee = 3.00f
val BasePrice = 15.00f
val PriceChange = 5

def Max(a: Float, b: Float): Float=if(a>=b) a else b
def NumberOfPeople(PriceChange: Int): Int = -1*(PriceChange*20/5)+120
def TicketPrice(priceChange: Int): Float = BasePrice + priceChange
def Income(numberOfPeople: Int, ticketPrice: Float): Float = ticketPrice * numberOfPeople
def Cost(numberOfPeople: Int): Float = CostForEachPerformance + (CostForEachAttendee * numberOfPeople)
def Profit(income: Float, cost: Float): Float = income - cost
def CalculateProfit(numberOfPeople: Int, ticketPrice: Float) : Float = Profit(Income(numberOfPeople, ticketPrice), Cost(numberOfPeople))

def FindBestPrice(priceIncrese: Int, priceDecrese: Int): Float = {
  val numberOfPeople_increased = NumberOfPeople(priceIncrese)
  val ticketPrice_increased = TicketPrice(priceIncrese)
  val profit_increased = CalculateProfit(numberOfPeople_increased, ticketPrice_increased)

  val numberOfPeople_decreased = NumberOfPeople(priceDecrese)
  val ticketPrice_decreased = TicketPrice(priceDecrese)
  val profit_decreased = CalculateProfit(numberOfPeople_decreased, ticketPrice_decreased)

  if(profit_increased >= profit_decreased) ticketPrice_increased else ticketPrice_decreased
}

println("Best ticket price Rs: ")
FindBestPrice(10, -10)

