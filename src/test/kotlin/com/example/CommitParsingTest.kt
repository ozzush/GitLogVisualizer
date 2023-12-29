package com.example

import com.example.git.decodeFromJsonArray
import org.junit.Test
import org.junit.jupiter.api.assertDoesNotThrow

class CommitParsingTest {
    @Test
    fun `test converting from json to Commits class`() {
        assertDoesNotThrow {
            decodeFromJsonArray("[$JSON_STRING_COMMIT]")
        }
    }
}

val JSON_STRING_COMMIT = """
  {
    "sha": "c4fc0b919dfe9b746f9ecfcc08668fa05b839064",
    "node_id": "C_kwDOADRfStoAKGM0ZmMwYjkxOWRmZTliNzQ2ZjllY2ZjYzA4NjY4ZmEwNWI4MzkwNjQ",
    "commit": {
      "author": {
        "name": "Yahor Berdnikau",
        "email": "yahor.berdnikau@jetbrains.com",
        "date": "2023-12-28T09:49:24Z"
      },
      "committer": {
        "name": "Space Team",
        "email": "noreply@jetbrains.team",
        "date": "2023-12-29T10:11:45Z"
      },
      "message": "[Gradle] Fix warnings in KotlinWithJavaCompilation\n\n^KT-56904 In Progress",
      "tree": {
        "sha": "76e67e09c4ae03efa80db240f3c955c02e147e86",
        "url": "https://api.github.com/repos/JetBrains/kotlin/git/trees/76e67e09c4ae03efa80db240f3c955c02e147e86"
      },
      "url": "https://api.github.com/repos/JetBrains/kotlin/git/commits/c4fc0b919dfe9b746f9ecfcc08668fa05b839064",
      "comment_count": 0,
      "verification": {
        "verified": false,
        "reason": "no_user",
        "signature": "-----BEGIN PGP SIGNATURE-----\n\niQIcBAADCQAGBQJljpthAAoJEIyVCkVppFll0e8P/2cKp17d1Yno3VGfSEJNq8OI\nmK0/AY3YugPMOcS5GD835CJYLvJsjOS74vKBMmuK2jqCPrzCeqBde5ukbIrl0zqD\neAuNM1WuMTv0YlQ2NADHM3QDia4SzZWVenwPTNmLbMugZPRalvianK3BsULS6UMO\ncyYrlCx4S5HSb8gFLYz78NY3VOpm6rRi9+5+fkPQNg4+HIXYdNrVzR+paE43nKPw\nQW0WNejaO9Vq2n/YwJA/eF3bllv2IOd5l98Ee10iPGx1sJ/sHHm947BEhvINRp30\nZNz0RGPl38N0tJpF4tgc6g/CiiDGXAfRBiHoEQKrATpmuN7f0VzeD1mjvp6vClOM\nrXHSNpK4HwdnHhFWAAzpMK4q4RnGBJsTu2HMk6IeTZi6ctZE0faHt5q3BtJ6jVGs\n727PRMyoIOBZ48VBvu5eDoyJ0E8anoURRaTW6RKdT10xhd2V8c7JaOt6pxe9G+4d\nJWIE/Bo3v8UVj07Mg1mFLMPD54Sj2VWsorhj8Gd0GZRYtJpd6cyQ63Tiuf23ZQD8\nqTraH9NrwfZTDddSlW+f9H2K3R5eFCEbGmC12HgVnZ0AeldktH6iDDX44QlVHbFm\n8yZN2GePB+O6lMVPDZsUZVXspOnyvCTReO9CoCVYh3aDjSZ1Jd17vOJn+uAPDHny\nRy7RiqVKMiKWymKXhQUh\n=kmrZ\n-----END PGP SIGNATURE-----",
        "payload": "tree 76e67e09c4ae03efa80db240f3c955c02e147e86\nparent 09a6f95a153841d65724d862450b4f6b2cba719a\nauthor Yahor Berdnikau <yahor.berdnikau@jetbrains.com> 1703756964 +0100\ncommitter Space Team <noreply@jetbrains.team> 1703844705 +0000\n\n[Gradle] Fix warnings in KotlinWithJavaCompilation\n\n^KT-56904 In Progress\n"
      }
    },
    "url": "https://api.github.com/repos/JetBrains/kotlin/commits/c4fc0b919dfe9b746f9ecfcc08668fa05b839064",
    "html_url": "https://github.com/JetBrains/kotlin/commit/c4fc0b919dfe9b746f9ecfcc08668fa05b839064",
    "comments_url": "https://api.github.com/repos/JetBrains/kotlin/commits/c4fc0b919dfe9b746f9ecfcc08668fa05b839064/comments",
    "author": {
      "login": "Tapchicoma",
      "id": 1595262,
      "node_id": "MDQ6VXNlcjE1OTUyNjI=",
      "avatar_url": "https://avatars.githubusercontent.com/u/1595262?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/Tapchicoma",
      "html_url": "https://github.com/Tapchicoma",
      "followers_url": "https://api.github.com/users/Tapchicoma/followers",
      "following_url": "https://api.github.com/users/Tapchicoma/following{/other_user}",
      "gists_url": "https://api.github.com/users/Tapchicoma/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/Tapchicoma/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/Tapchicoma/subscriptions",
      "organizations_url": "https://api.github.com/users/Tapchicoma/orgs",
      "repos_url": "https://api.github.com/users/Tapchicoma/repos",
      "events_url": "https://api.github.com/users/Tapchicoma/events{/privacy}",
      "received_events_url": "https://api.github.com/users/Tapchicoma/received_events",
      "type": "User",
      "site_admin": false
    },
    "committer": null,
    "parents": [
      {
        "sha": "09a6f95a153841d65724d862450b4f6b2cba719a",
        "url": "https://api.github.com/repos/JetBrains/kotlin/commits/09a6f95a153841d65724d862450b4f6b2cba719a",
        "html_url": "https://github.com/JetBrains/kotlin/commit/09a6f95a153841d65724d862450b4f6b2cba719a"
      }
    ]
  }
""".trimIndent()