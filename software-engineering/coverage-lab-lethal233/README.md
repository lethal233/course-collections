# Coverage-lab

**Name:** 黎诗龙

**SID:** 11811407

# Answers

- Q: Could Evosuite achieve 100% line coverage?

  A: Maybe, it depends. Since it cannot ever reach the dead code. Maybe some simple code it will reach the 100% line coverage.

- Q: For each uncovered block of code, explain why the tool cannot cover.

  A: 

  - For Line `13` and `14`, it cannot be reached because the length of `course` is less than or equal to `4`, it will first step into the branch Line `11` and `12`.

    `name.equals(course.toLowerCase())` cannot be reached.

  - For Line `18` and `19`, it cannot be reached because the `!name.equals(name)` is always false.

- Q: Write more tests to increase the code coverage.

  A: It is **impossible** to increase the code coverage, according to the reasons above (since it contains dead codes).

