/*
  Copyright (C) 2002-2008 Jeroen Frijters

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
using System.Reflection;
using System.Runtime.CompilerServices;

[assembly: AssemblyTitle("IKVM.NET Runtime JNI Layer")]
[assembly: AssemblyDescription("JVM for Mono and .NET")]

#if SIGNCODE
[assembly: InternalsVisibleTo("IKVM.Runtime, PublicKey=00240000048000009400000006020000002400005253413100040000010001006925CBFB38BA2BB7A562B8BC6E6C3AC8E94B78AEEA42BD2AF261171E6A2E8B58A47009FE6C28300AE986AF85B93FA7E6668DAEA2A126607B7CB65CEE49DBB9852D40737812D92A2D2EF7A3DC84FB4FD421B63976CBB8C37A81596C0A4ACB340C40549249868DE685AF1566681FCB782D7381BE5AC70A5B291726B478A9B652BB")]
#else
[assembly: InternalsVisibleTo("IKVM.Runtime")]
#endif
