import org.scalatest.flatspec.AnyFlatSpec
class CompareTest  extends AnyFlatSpec {
  it should "return false because both persons are equal" in {
    val first= new Compare("DD", 22)
    val second = new Compare("DD",22)
    val result = first > second
    assert(result)
  }
  it should "return true as age of first person is greater" in {
    val first = new Compare("DD", 22)
    val second = new Compare("DD",20)
    val result = first > second
    assert(result)
  }
  it should "return false as age of first person is less" in {
    val first = new Compare("DD", 20)
    val second = new Compare("DD",22)
    val result = first > second
    assert(!result)
  }
  it should "return true as length of second person's name is less" in{
    val first = new Compare("Divyansh", 22)
    val second = new Compare("DD",22)
    val result = first > second
    assert(result)
  }
  it should "return false as length of first person's name is less" in{
    val first = new Compare("DD", 22)
    val second = new Compare("Divyansh",22)
    val result = first > second
    assert(!result)
  }
}
