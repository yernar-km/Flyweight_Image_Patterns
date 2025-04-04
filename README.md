# solution_homework-5
### Image Management System - Proxy Pattern

# What Problem Was Solved?

-Loading high-resolution images slowed down the website. A solution was needed to show low-res thumbnails instantly and load high-res images only when requested

# How Did the Pattern Simplify or Optimize the Design?

-The Proxy Pattern improved performance by delaying high-res image loading until needed (Virtual Proxy) and restricting uploads to authorized agents (Protection Proxy)


 ### Flyweight Pattern - Map Application
# What Problem Was Solved?

- The Flyweight Pattern was used to optimize memory usage in a map application displaying numerous location markers. Without it, the application would create redundant style objects for each marker, wasting memory and affecting performance
- 
# How Did the Pattern Simplify or Optimize the Design?

- The pattern reduces memory usage by reusing shared marker styles for different markers. It centralizes style creation, ensuring that only unique styles are created and reused across many markers, thus optimizing memory consumption and improving performance
