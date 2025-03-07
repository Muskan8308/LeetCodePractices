class Solution {
    public int[] closestPrimes(int left, int right) {
        
        List<Integer> primes = new ArrayList<>();
        
        // Find all prime numbers in the range [left, right]
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        // If there are less than 2 primes, return [-1, -1]
        if (primes.size() < 2) return new int[]{-1, -1};

        // Find the closest prime pair
        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[2];

        for (int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = primes.get(i - 1);
                result[1] = primes.get(i);
            }
        }

        return result;
    
    }

    private boolean isPrime(int num)
    {
        if(num <= 1)
        return false;

        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
            return false;
        }

        return true;
    }
}