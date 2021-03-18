class Compare(val name: String, val age: Int) extends Ordered[Compare] {
  def compare(that: Compare): Int =
    if (this.name == that.name) {  // if name are equal then the comparison is based on age of the person
      if(this.age < that.age) { -1}
      else { 1}
    }
    else {
      if (this.name.length >= that.name.length) {
        1   //when name are different comparision is done on the basis of length of the name.
      } else {
        -1
      }
    }
}