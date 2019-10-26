package xml;

/**
 *<picture name="The Black Square"/>
 *
 * If the value of the attribute contains double quotes, you need to use single quotes. For example:
 *
 * <picture name='"Sunset at Sea", Ivan Aivazovsky'/>
 *
 * Sometimes, you can also see quotes replaced by special entity symbols (&quot):
 *
 * <picture name="&quot;Sunflowers&quot;, Van Gogh"/>
 *
 * An element can contain more than one attribute:
 *
 * <picture name='Sunset at Sea' author='Ivan Aivazovsky'/>
 *
 * The following XML document presents an art gallery:
 *
 * <?xml version="1.0" encoding="UTF-8"?>
 * <gallery>
 *   <picture name='Sunset at Sea' author='Ivan Aivazovsky'/>
 *   <picture name='The Black Square' author='Kazimir Malevich'/>
 *   <picture name='Sunflowers' author='Van Gogh'/>
 * </gallery>
 *
 * As you can see, in some cases, attributes can replace child elements. T
 * here is no consensus about what's better to use. It usually depends on the
 * data you are trying to model, your tools for XML processing and, of course,
 * the people you work with.
 * <products>
 *     <product>
 *         <name>"A"</name>
 *         <cost>"100"</cost>
 *     </product>
 *     <product>
 *  *         <name>"B"</name>
 *  *         <cost>"200"</cost>
 *  *     </product>
 *     <product>
 *  *         <name>"C"</name>
 *  *         <cost>"300"</cost>
 *  *     </product>
 * </products>
 *
 *<book title='train'>
 *      <authors>
 *          <author name='A'/>
 *      </authors>
 *      *      <authors>
 *  *          <author name='B'/>
 *  *      </authors>
 *  *      <authors>
 *  *          <author name='C'/>
 *  *      </authors>
 *
 *</book>
 */

public class Xml {
}
