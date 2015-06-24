import java.util.ArrayList;

class PrimeNumberDecomposer {
  /**
     Return value: List of all prime factors of a given number n
  */
  public static Long[] getAllPrimeFactors(long n) {
    ArrayList<Long> list = new ArrayList<>();
    for(long i=1;i<Math.floor(Math.sqrt(n));i++){
      if(list.contains(i))
        continue;
      long c = n%i;
      if(c==Math.floor(c)){
        list.add(i);
        if(!list.contains(c))
          list.add(c);
      }
    }
    //return new Long[] {};
    return list.toArray(new Long[list.size()]);
  }
  /**
     Return value: List containing two lists, first containg all prime factors without duplicates,
     second containing the count, how often each prime factor occured.
     Return code always contains two lists.
     
     e.g.: getUniquePrimeFactorsWithCount(100) = {{2,5},{2,2}) // prime 2 occurs 2 times, prime 2 occurs 5 times, 
  */
  public static Long[][] getUniquePrimeFactorsWithCount(long n) {
    return new Long[][] {{},{}};
  }
  /**
     Return value: List containing product of same prime factors,
     e.g.: 45 = 3*3*5 ==>  {3^2,5^1} == {9,5}
     e.g.: getUniquePrimeFactorsWithCount(100) = {{2,5},{2,2}) // prime 2 occurs 2 times, prime 2 occurs 5 times, 
  */
  public static Long[] getPrimeFactorPotencies(long n) {
    return new Long[] {};
  }
}

