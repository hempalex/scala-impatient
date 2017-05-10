class BitSequence {
  var bitfield : Long = 0

  def apply(offset : Int) : Boolean =  {
    (bitfield & (1 << offset)) != 0
  }

  def update(offset : Int, v : Boolean ) = {
    if(v) {
      bitfield |= 1 << offset
    } else if(apply(offset)) {
        bitfield -= 1 << offset
    }
  }
}

object BitSequence {
  def apply() = { new BitSequence() }
}

val b = BitSequence()
println(b(4))
b(4) = true
println(b(4))
b(4) = false
println(b(4))
