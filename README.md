# Students-Taking-A-Specific-Class
This was asked at an interview. Say you have a students class with two strings, name and takesClass. Find all the students taking the same class e.g. "Yoga".

For example we have the following students

<table>
<tr>
<td><strong>Name</strong></td>
<td><strong>Class</strong></td>
</tr>
<tr>
<td>Tom</td>
<td>Yoga</td>
</tr>
<tr>
<td>Anna</td>
<td>Karate</td>
</tr>
<tr>
<td>Erica</td>
<td>Yoga</td>
</tr>
</table>

<h2> proposes solution</h2>
Use a hashmap to store the name, class pairs. Create a method <i>getAllKeysForValue</i> with generic object type to navigate through the hashmap searching for a specific value. If that value is found then its corresponding key is stored in a list object. In the main method, simply create the hashmap. populate it and print out the keys returned by the  <i>getAllKeysForValue</i>.

In this example the output should be [Tom, Erica]
