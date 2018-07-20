/*
  Copyright (C) 2006-2014 Jeroen Frijters

  This software is provided 'as-is', without any express or implied
  warranty.  In no event will the authors be held liable for any damages
  arising from the use of this software.

  Permission is granted to anyone to use this software for any purpose,
  including commercial applications, and to alter it and redistribute it
  freely, subject to the following restrictions:

  1. The origin of this software must not be misrepresented; you must not
     claim that you wrote the original software. If you use this software
     in a product, an acknowledgment in the product documentation would be
     appreciated but is not required.
  2. Altered source versions must be plainly marked as such, and must not be
     misrepresented as being the original software.
  3. This notice may not be removed or altered from any source distribution.

  Jeroen Frijters
  jeroen@frijters.net
  
*/

@cli.System.Reflection.AssemblyCopyrightAttribute.Annotation(
    "This software is licensed under the GNU General Public License version 2 + \"Classpath\" exception.\r\n" +
    "See http://www.gnu.org/software/classpath/license.html for details.\r\n" +
    "1988       AT&T\r\n" +
    "2009-2014  Attila Szegedi\r\n" +
    "1995       Colin Plumb\r\n" +
    "1999-2014  Free Software Foundation\r\n" +
    "2001-2005  freebxml.org\r\n" +
    "1998       FundsXpress, INC.\r\n" +
    "2009       Google Inc.\r\n" +
    "2008-2013  i-net software\r\n" +
    "2000-2013  INRIA, France Telecom\r\n" +
    "1993-2013  International Business Machines, Inc.\r\n" +
    "2002-2015  Jeroen Frijters\r\n" +
    "1994-2015  Oracle and/or its affiliates\r\n" +
    "2007       Red Hat, Inc.\r\n" +
    "2007-2013  Stephen Colebourne & Michael Nascimento Santos\r\n" +
    "1993-1997  Sun Microsystems, Inc.\r\n" +
    "1996-1998  Taligent, Inc.\r\n" +
    "2001-2002  Thai Open Source Software Center Ltd\r\n" +
    "1999-2006  The Apache Software Foundation\r\n" +
    "1995-2000  The Cryptix Foundation Limited\r\n" +
    "1997       The Open Group Research Institute\r\n" +
    "1991-2012  Unicode, Inc.\r\n" +
    "1999       Visual Numerics Inc.\r\n" +
    "2003       Wily Technology, Inc.\r\n" +
    "2000-2004  World Wide Web Consortium"
)

@cli.System.Reflection.AssemblyTitleAttribute.Annotation("IKVM.NET OpenJDK Library for .NET")
@cli.System.Reflection.AssemblyProductAttribute.Annotation("IKVM.NET")
@cli.System.Reflection.AssemblyCompanyAttribute.Annotation("Jeroen Frijters")
@cli.System.Reflection.AssemblyInformationalVersionAttribute.Annotation("8.5.0.1")

@cli.System.Runtime.CompilerServices.InternalsVisibleToAttribute.Annotation.__Multiple({
    @cli.System.Runtime.CompilerServices.InternalsVisibleToAttribute.Annotation("IKVM.Runtime, PublicKey=00240000048000009400000006020000002400005253413100040000010001006925CBFB38BA2BB7A562B8BC6E6C3AC8E94B78AEEA42BD2AF261171E6A2E8B58A47009FE6C28300AE986AF85B93FA7E6668DAEA2A126607B7CB65CEE49DBB9852D40737812D92A2D2EF7A3DC84FB4FD421B63976CBB8C37A81596C0A4ACB340C40549249868DE685AF1566681FCB782D7381BE5AC70A5B291726B478A9B652BB"),
    @cli.System.Runtime.CompilerServices.InternalsVisibleToAttribute.Annotation("IKVM.AWT.WinForms, PublicKey=00240000048000009400000006020000002400005253413100040000010001006925CBFB38BA2BB7A562B8BC6E6C3AC8E94B78AEEA42BD2AF261171E6A2E8B58A47009FE6C28300AE986AF85B93FA7E6668DAEA2A126607B7CB65CEE49DBB9852D40737812D92A2D2EF7A3DC84FB4FD421B63976CBB8C37A81596C0A4ACB340C40549249868DE685AF1566681FCB782D7381BE5AC70A5B291726B478A9B652BB")
})

@cli.System.Security.AllowPartiallyTrustedCallersAttribute.Annotation

// type to collect Assembly attributes applicable to all core library assemblies
interface commonAttributes {}

/////////////////////////////////////////////////////////////////////////////

// Roslyn requires that assemblies that contain types that define extension methods have the attribute on the assembly as well
@cli.System.Runtime.CompilerServices.ExtensionAttribute.Annotation

// type to collect Assembly attributes specific to IKVM.OpenJDK.Core
interface coreAttributes {}
