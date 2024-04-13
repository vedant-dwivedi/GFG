<h2><a href="https://www.geeksforgeeks.org/problems/minimum-points-to-reach-destination0540/1">Minimum Points To Reach Destination</a></h2><h3>Difficulty Level : Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a <strong>m*n</strong> grid with each cell consisting of <strong>positive</strong>, <strong>negative</strong>, or <strong>zero</strong> point. We can move across a cell only if we have positive points. Whenever we pass through a cell, points in that cell are added to our overall points, the task is to find <strong>minimum initial points</strong> to reach cell <strong>(m-1, n-1)</strong> from <strong>(0, 0)</strong> by following these certain set of rules :<br>1. From a cell (i, j) we can move to (i + 1, j) or (i, j + 1).<br>2. We cannot move from (i, j) if your overall points at (i, j) are &lt;= 0.<br>3. We have to reach at (n-1, m-1) with minimum positive points i.e., &gt; 0.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: <br>m = 3, n = 3 <br>points = {{-2,-3,3}, 
          {-5,-10,1},<br>          {10,30,-5}}</span> <br><span style="font-size: 18px;"><strong>Output:</strong> <br>7 <br><strong>Explanation</strong>: 7 is the minimum value to reach the destination with positive throughout the path. Below is the path. (0,0) -&gt; (0,1) -&gt; (0,2) -&gt; (1, 2) -&gt; (2, 2) We start from (0, 0) with 7, we reach (0, 1) with 5, (0, 2) with 2, (1, 2) with 5, (2, 2) with and finally we have 1 point (we needed greater than 0 points at the end).</span></pre>
<div><span style="font-size: 18px;"><strong>Example 2:</strong></span></div>
<pre><span style="font-size: 18px;"><strong>Input:<br></strong>m = 3, n = 2
points = {{2,3},  <br>          {5,10},  <br>          {10,30}} <br><strong>Output: <br></strong>1 <br><strong>Explanation</strong>: Take any path, all of them are positive. So, required one point at the start</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:&nbsp;&nbsp;</strong><br>You don't need to read input or print anything. Complete the function <strong><code>minPoints</code>()&nbsp;</strong>which takes <strong>m,n</strong> and 2-d<strong> </strong>vector&nbsp;<strong>points</strong><strong> </strong>as input parameters and returns the&nbsp;<strong>minimum initial points</strong>&nbsp;to reach cell&nbsp;<strong>(m-1, n-1)</strong>&nbsp;from&nbsp;<strong>(0, 0).</strong><br><br><strong>Expected Time Complexity:</strong> O(n*m)<br><strong>Expected Auxiliary Space:</strong> O(n*m)<br><br><strong>Constraints:</strong><br>1 ≤ m ≤ 10<sup>3&nbsp;</sup>&nbsp;<br>1 ≤ n ≤ 10<sup>3<br></sup></span><span style="font-size: 18px;">-10</span><sup>3</sup><span style="font-size: 18px;"> ≤ points[i][j] ≤ 10<sup>3</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>Algorithms</code>&nbsp;